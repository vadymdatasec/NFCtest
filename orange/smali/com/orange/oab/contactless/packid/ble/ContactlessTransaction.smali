.class public Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;,
        Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;
    }
.end annotation


# static fields
.field public static final TRANSACTION_TIMEOUT:I = 0x2710

.field public static a:Landroid/os/Handler;

.field public static b:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->a:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static dismissTransactionNotification()V
    .locals 3

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->a:Landroid/os/Handler;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->b:Ljava/lang/Runnable;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-void
.end method

.method public static setupAbortionTimeout(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->a:Landroid/os/Handler;

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->b:Ljava/lang/Runnable;

    .line 3
    sget-object p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;->a:Landroid/os/Handler;

    const-wide/16 p1, 0x2710

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
