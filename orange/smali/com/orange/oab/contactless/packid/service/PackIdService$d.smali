.class public Lcom/orange/oab/contactless/packid/service/PackIdService$d;
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
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$d;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$d;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Lcom/orange/oab/contactless/packid/service/PackIdService;)Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a()V

    :cond_0
    return-void
.end method
