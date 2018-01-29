package com.example.advai.mqttawsiotmosquittosecureconnection;

import com.amazonaws.regions.Regions;

/**
 * Created by advai on 1/26/2018.
 */

public class Constants {

    // AWS Iot CLI describe-endpoint call returns: XXXXXXXXXX.iot.<region>.amazonaws.com
    public static final String CUSTOMER_SPECIFIC_ENDPOINT = "XXXXXXXXXX.iot.us-east-1.amazonaws.com";

    // Cognito pool ID. For this app, pool needs to be unauthenticated pool with
    // AWS IoT permissions.
    public static final String COGNITO_POOL_ID = "us-east-1:XXXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";

    // Name of the AWS IoT policy to attach to a newly created certificate
    public static final String AWS_IOT_POLICY_NAME = "bridge";

    // Region of AWS IoT
    public static final Regions MY_REGION = Regions.US_EAST_1;

    // Filename of KeyStore file on the filesystem
    public static final String KEYSTORE_NAME = "iot_keystore";

    // Password for the private key in the KeyStore
    public static final String KEYSTORE_PASSWORD = "password";

    // Certificate and key aliases in the KeyStore
    public static final String CERTIFICATE_ID = "default";
}
