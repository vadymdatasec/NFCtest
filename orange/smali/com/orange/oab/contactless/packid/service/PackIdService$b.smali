.class public Lcom/orange/oab/contactless/packid/service/PackIdService$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/service/PackIdService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "contactlessId"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lfr/mbs/binary/Octets;

    const-string v1, "zoneId"

    .line 2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Lfr/mbs/binary/Octets;

    .line 3
    new-instance v1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v1, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0, p2}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-void
.end method
