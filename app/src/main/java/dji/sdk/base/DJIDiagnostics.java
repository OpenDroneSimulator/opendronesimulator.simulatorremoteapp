package dji.sdk.base;

import java.util.List;

/**
 *
 *
 * Product Diagnostics.
 */

public class DJIDiagnostics
{
    /**
     * Callback interface that updates the product's current diagnostics information.
     */
    public interface UpdateDiagnosticsListCallback
    {
        public abstract void onDiagnosticsListUpdate (List<DJIDiagnostics> diagnosticsList);
    }

    private int _code;
    private String _reason;
    private String _solution;

    public DJIDiagnostics ()
    {
        _code = 0;
        _reason = "Unknown";
        _solution = "Unknown";
    }

    public DJIDiagnostics (int code, String reason, String solution)
    {
        _code = code;
        _reason = reason;
        _solution = solution;
    }

    public boolean equals (Object o)
    {
        return false;
    }

    /**
     * Get diagnostics error code.
     * @return  Diagnostics error code
     */
    public int getCode ()
    {
        return _code;
    }

    /**
     * Get the reason of the error.
     * @return  Reason of the error.
     */
    public String getReason ()
    {
        return _reason;
    }

    /**
     * Get the suggest solution for the error.
     * @return  The suggest solution for the error.
     */
    public String getSolution ()
    {
        return _solution;
    }
}
