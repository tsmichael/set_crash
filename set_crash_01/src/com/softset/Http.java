package com.softset;

import java.util.Scanner;

public class Http {
    public enum http {
        Bad_Request,
        Unauthorized,
        Payment_Required,
        Forbidden,
        Not_Found,
        Method_Not_Allowed,
        Not_Acceptable,
        Proxy_Authentication_Required,
        Request_Timeout,
        Conflict,
        Gone,
        Length_Required,
        Precondition_Failed,
        Payload_Too_Large,
        URI_Too_Long,
        Unsupported_Media_Type,
        Range_Not_Satisfiable,
        Expectation_Failed,
        I_am_a_teapot,
        Authentication_Timeout,
        Misdirected_Request,
        Unprocessable_Entity,
        Locked,
        Failed_Dependency,
        Upgrade_Required,
        Precondition_Required,
        Too_Many_Requests,
        Request_Header_Fields_Too_Large,
        Retry_With,
        Unavailable_For_Legal_Reasons,
        Bad_sended_request,
        Client_Closed_Request;
        }

        public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        http error;

        System.out.println("Input number of ERROR [400-499]");
        int number_error=input.nextInt();
        switch(number_error)
        {
            case 400:
                error=http.Bad_Request;
                System.out.println(error);
                break;
            case 401:
                error=http.Unauthorized;
                System.out.println(error);
                break;
            case 402:
                error=http.Payment_Required;
                System.out.println(error);
                break;
            case 403:
                error=http.Forbidden;
                System.out.println(error);
                break;
            case 404:
                error=http.Not_Found;
                System.out.println(error);
                break;
            case 405:
                error=http.Method_Not_Allowed;
                System.out.println(error);
                break;
            case 406:
                error=http.Not_Acceptable;
                System.out.println(error);
                break;
            case 407:
                error=http.Proxy_Authentication_Required;
                System.out.println(error);
                break;
            case 408:
                error=http.Request_Timeout;
                System.out.println(error);
                break;
            case 409:
                error=http.Conflict;
                System.out.println(error);
                break;
            case 410:
                error=http.Gone;
                System.out.println(error);
                break;
            case 411:
                error=http.Length_Required;
                System.out.println(error);
                break;
            case 412:
                error=http.Precondition_Failed;
                System.out.println(error);
                break;
            case 413:
                error=http.Payload_Too_Large;
                System.out.println(error);
                break;
            case 414:
                error=http.URI_Too_Long;
                System.out.println(error);
                break;
            case 415:
                error=http.Unsupported_Media_Type;
                System.out.println(error);
                break;
            case 416:
                error=http.Range_Not_Satisfiable;
                System.out.println(error);
                break;
            case 417:
                error=http.Expectation_Failed;
                System.out.println(error);
                break;
            case 418:
                error=http.I_am_a_teapot;
                System.out.println(error);
                break;
            case 419:
                error=http.Authentication_Timeout;
                System.out.println(error);
                break;
            case 421:
                error=http.Misdirected_Request;
                System.out.println(error);
                break;
            case 422:
                error=http.Unprocessable_Entity;
                System.out.println(error);
                break;
            case 423:
                error=http.Locked;
                System.out.println(error);
                break;
            case 424:
                error=http.Failed_Dependency;
                System.out.println(error);
                break;
            case 426:
                error=http.Upgrade_Required;
                System.out.println(error);
                break;
            case 428:
                error=http.Precondition_Required;
                System.out.println(error);
                break;
            case 429:
                error=http.Too_Many_Requests;
                System.out.println(error);
                break;
            case 431:
                error=http.Request_Header_Fields_Too_Large;
                System.out.println(error);
                break;
            case 449:
                error=http.Retry_With;
                System.out.println(error);
                break;
            case 451:
                error=http.Unavailable_For_Legal_Reasons;
                System.out.println(error);
                break;
            case 452:
                error=http.Bad_sended_request;
                System.out.println(error);
                break;
            case 499:
                error=http.Client_Closed_Request;
                System.out.println(error);
                break;
            default:
                System.out.println("Hello Nazar ^-^");
        }
    }
}
