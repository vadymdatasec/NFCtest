.class public Lcom/orange/oab/contactless/packid/service/PackIdService$c;
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


# instance fields
.field public final synthetic a:Lcom/orange/oab/contactless/packid/service/PackIdService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$c;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "contactlessId"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lfr/mbs/binary/Octets;

    const-string v0, "zoneId"

    .line 2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Lfr/mbs/binary/Octets;

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$c;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Lcom/orange/oab/contactless/packid/service/PackIdService;)Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-void
.end method
