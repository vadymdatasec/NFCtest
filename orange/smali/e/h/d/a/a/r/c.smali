.class public Le/h/d/a/a/r/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1}, Le/h/a/a/a/a/b;->b(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {p2, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->startBle()V

    :cond_0
    return-void
.end method
