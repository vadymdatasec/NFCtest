.class public Lcom/orange/hce/proto/activity/LogActivity$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/LogActivity;->s()Landroid/content/BroadcastReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/activity/LogActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "Unknown"

    return-object p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    const-string v0, "contactlessId"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "zoneId"

    .line 2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const-string v2, "readerAddress"

    .line 3
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "rssi"

    .line 4
    invoke-virtual {p2, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 5
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v4}, Lcom/orange/hce/proto/activity/LogActivity;->b(Lcom/orange/hce/proto/activity/LogActivity;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v4}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object v4

    int-to-byte v5, p2

    invoke-virtual {v4, v0, v1, v2, v5}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->addValue(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;B)V

    .line 7
    :cond_0
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v4, v0, v1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/l/e1;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 8
    iget-object v5, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v5}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object v5

    invoke-virtual {v5, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiResults(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, p2, v5}, Le/h/b/a/l/e1;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    :cond_1
    iget-object p2, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/LogActivity;->b(Lcom/orange/hce/proto/activity/LogActivity;)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object p2

    invoke-virtual {p2, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->isCalibrationCompleted(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 10
    sget p2, Lcom/orange/hce/proto/activity/LogActivity;->B:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RSSI calibration "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1, p1}, Lcom/orange/hce/proto/activity/LogActivity$e;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ") with "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v5}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object v5

    invoke-virtual {v5, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->count(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " values :"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p2, v4, v3}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    .line 11
    sget p2, Lcom/orange/hce/proto/activity/LogActivity;->B:I

    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v4}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object v4

    invoke-virtual {v4, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiResults(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p2, v4, v3}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    .line 12
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$e;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object p1

    invoke-virtual {p1, v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->reset(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
