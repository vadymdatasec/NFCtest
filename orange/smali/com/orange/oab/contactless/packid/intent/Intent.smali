.class public final Lcom/orange/oab/contactless/packid/intent/Intent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;
    }
.end annotation


# static fields
.field public static final ACTION_BADGE_LOCKED:Ljava/lang/String; = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"

.field public static final ACTION_BADGE_UNLOCKED:Ljava/lang/String; = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"

.field public static final ACTION_CONTACTLESS_TRANSACTION:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

.field public static final ACTION_DISMISSED_NOTIFICATION:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"

.field public static final ACTION_ENCRYPTOR_INITIALIZED:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"

.field public static final ACTION_RSSI:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.RSSI"

.field public static final ACTION_RSSI_BUTTON_IN_RANGE:Ljava/lang/String; = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"

.field public static final ACTION_RSSI_LEVEL_CHANGED:Ljava/lang/String; = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"

.field public static final ACTION_SCAN_MODE:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.ACTION_SCAN_MODE"

.field public static final ACTION_SCREEN_UNLOCKED_ERROR:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"

.field public static final ACTION_SHOW_BADGE:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.SHOW_BADGE"

.field public static final ACTION_START_BADGE_TRANSACTION:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"

.field public static final ACTION_UPDATE_USERS:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.UPDATE_USERS"

.field public static final ACTION_USER_LOADING_ERROR:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

.field public static final ACTION_USER_UPDATED:Ljava/lang/String; = "com.orange.oab.contactless.packid.action.USER_UPDATED"

.field public static final EXTRA_ADDED_BADGES:Ljava/lang/String; = "addedBadges"

.field public static final EXTRA_ALERT_ON_NETWORK_ERROR:Ljava/lang/String; = "alertOnNetworkError"

.field public static final EXTRA_BADGE:Ljava/lang/String; = "badge"

.field public static final EXTRA_BUTTON_STATUS:Ljava/lang/String; = "button_status"

.field public static final EXTRA_CONTACTLESS_ID:Ljava/lang/String; = "contactlessId"

.field public static final EXTRA_DEVICE_NAME:Ljava/lang/String; = "deviceName"

.field public static final EXTRA_EVENT_TYPE:Ljava/lang/String; = "eventType"

.field public static final EXTRA_EXCEPTION:Ljava/lang/String; = "exception"

.field public static final EXTRA_FIREBASE_REGISTRATION_ID:Ljava/lang/String; = "firebaseRegistrationId"

.field public static final EXTRA_MESSAGE:Ljava/lang/String; = "message"

.field public static final EXTRA_READER_ADDRESS:Ljava/lang/String; = "readerAddress"

.field public static final EXTRA_READER_NAME:Ljava/lang/String; = "readerName"

.field public static final EXTRA_REASON:Ljava/lang/String; = "reason"

.field public static final EXTRA_REMOVED_BADGES:Ljava/lang/String; = "removedBadges"

.field public static final EXTRA_RSSI:Ljava/lang/String; = "rssi"

.field public static final EXTRA_RSSI_LEVEL:Ljava/lang/String; = "rssiLevel"

.field public static final EXTRA_SCAN_MODE:Ljava/lang/String; = "readerAddress"

.field public static final EXTRA_SEND_USERS_UPDATED_INTENT:Ljava/lang/String; = "sendUsersUpdatedIntent"

.field public static final EXTRA_TIMEOUT:Ljava/lang/String; = "timeout"

.field public static final EXTRA_ZONE_ID:Ljava/lang/String; = "zoneId"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
