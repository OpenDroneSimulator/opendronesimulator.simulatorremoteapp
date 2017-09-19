package dji.common.util;

import dji.common.error.DJIError;

/**
 * Created by Yanneck on 10.02.2017.
 */

public class DJICommonCallbacks
{
    public interface DJICompletionCallback
    {
        /**
         * Invoked with execution result when the asynchronous call completes. Override to handle in your own code. If the asynchronous call completes successfully, it will return null.
         * @param error The DJI error result
         */
        public abstract void onResult(DJIError error);
    }

    public interface DJICompletionCallbackWith<T>
    {
        /**
         * Invoked with error code when the asynchronous call fails to complete normally.
         * @param error
         */
        public abstract void onFailure(DJIError error);

        /**
         * Invoked with result requested when the asynchronous call completes successfully.
         * @param t
         */
        public abstract void onSuccess (T t);
    }

    public static interface DJICompletionCallbackWithTwoParam<X, Y>
    {
        /**
         * Invoked with the error code when the asynchronous call fails to complete normally. Override to handle in your own code.
         * @param error
         */
        public abstract void onFailure (DJIError error);

        /**
         * Invoked with the result requested when the asynchronous call completes successfully. Override to handle in your own code.
         * @param x
         * @param y
         */
        public abstract void onSuccess (X x, Y y);
    }

    public static interface DJICompletionCallbackWithThreeParam<X, Y, Z>
    {
        /**
         * Invoked with the error code when the asynchronous call fails to complete normally. Override to handle in your own code.
         * @param error
         */
        public abstract void onFailure(DJIError error);

        /**
         * Invoked with the result requested when the asynchronous call completes successfully. Override to handle in your own code.
         * @param x
         * @param y
         * @param z
         */
        public abstract void onSuccess(X x, Y y, Z z);
    }
}
