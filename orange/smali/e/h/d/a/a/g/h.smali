.class public final Le/h/d/a/a/g/h;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/h/d/a/a/g/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/g/g;-><init>(Li/h/c/g;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-static {v1, v0}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, -0x80000000

    const-string v1, "android.bluetooth.adapter.extra.STATE"

    .line 2
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    const/16 v0, 0xa

    const-string v1, "packid.ble.stateChange"

    if-eq p2, v0, :cond_1

    const/16 v0, 0xc

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "Bluetooth state change to ON"

    .line 3
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    sget-object p2, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {p2, p1}, Le/h/d/a/a/g/f;->b(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    const-string p2, "Bluetooth state change to OFF"

    .line 5
    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    sget-object p2, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {p2, p1}, Le/h/d/a/a/g/f;->c(Landroid/content/Context;)V

    .line 7
    :goto_0
    sget-object p2, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    invoke-virtual {p2, p1}, Le/h/d/a/a/r/b;->g(Landroid/content/Context;)V

    :cond_2
    return-void
.end method
