package com.example.bookmanagement.config;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(
        access = PRIVATE)
public class Constant {

    /*
     * public static final String GRANT_TYPE = "grant_type"; public static final String GRANT_TYPE_SOCIAL = "social";
     * public static final String USER_NAME = "username"; public static final String MOBILE_NUMBER = "mobileNumber";
     * public static final String SOCIAL_TOKEN = "socialtoken"; public static final String SOCIAL_TYPE = "socialtype";
     * public static final String GRANT_TYPE_OTP = "otp"; public static final String OTP = "otp"; public static final
     * String EMAIL = "email"; public static final String OTP_TYPE = "otptype"; public static final String ERROR_CODE =
     * "errorCode"; public static final String ERROR_DESCRIPTION = "errorDescription"; public static final String
     * DETAIL_ERROR_MESSAGE = "detailErrorMessage"; public static final String USER_STATUS_PENDING = "PENDING"; public
     * static final String USER_STATUS_ACTIVE = "ACTIVE"; public static final String IMAGE = "IMAGE"; public static
     * final String VIDEO = "VIDEO"; public static final String FILE_TYPE_ORIGINAL = "ORIGINAL"; public static final
     * String FILE_TYPE_THUMBNAIL = "THUMBNAIL"; public final static String REGISTRATION = "REGISTRATION"; public final
     * static String RESET_PASSWORD = "RESET_PASSWORD"; public static String USER_INFO_KEY = "userInfo";
     */

    /* keep such error messages in error.properties */
    public static final String ADAPTER_INPUT_VALIDATION = "Input must not be null!";
    public static final String BOOK_FOUND_FAILURE = "No book found with given ID ";
    public static final String BOOK_DELETE_SUCCESS = "Book has been deleted with given ID ";
    public static final String BOOK_UPDATE_SUCCESS = "Book has been updated with given ID ";
    public static final String BOOK_UPDATE_FAILURE = "Book has NOT been updated, null data is unacceptable ";
    public static final String BOOK_GET_FAILURE = "Book found, but disintegrated data (null values exist)";
}
