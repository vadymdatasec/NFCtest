.class public final Le/h/d/a/a/v/e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Le/h/d/a/a/v/f;


# direct methods
.method public constructor <init>(Le/h/d/a/a/v/f;)V
    .locals 0

    iput-object p1, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    invoke-static {v0}, Le/h/d/a/a/v/f;->a(Le/h/d/a/a/v/f;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Posting timeout LEVEL change"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    invoke-virtual {v1}, Le/h/d/a/a/v/f;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    .line 3
    iget-object v1, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    invoke-virtual {v1}, Le/h/d/a/a/v/f;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    .line 4
    iget-object v2, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    invoke-virtual {v2}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    invoke-virtual {v3}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;

    move-result-object v3

    .line 6
    sget-object v4, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 7
    invoke-virtual {v0, v1, v2, v3, v4}, Le/h/d/a/a/r/a;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    .line 8
    iget-object v0, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-static {v0, v1}, Le/h/d/a/a/v/f;->a(Le/h/d/a/a/v/f;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    .line 9
    iget-object v0, p0, Le/h/d/a/a/v/e;->b:Le/h/d/a/a/v/f;

    sget-object v1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/f;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    return-void
.end method
