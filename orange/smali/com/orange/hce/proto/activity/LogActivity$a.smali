.class public Lcom/orange/hce/proto/activity/LogActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/LogActivity;->onResume()V
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
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$a;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity$a;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v0}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->reset()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity$a;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 3
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/orange/hce/proto/activity/LogActivity;->C:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    const-string p2, "Starting"

    goto :goto_0

    :cond_0
    const-string p2, "Stopping"

    :goto_0
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " RSSI calibration"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->log(Landroid/content/Context;ILjava/lang/String;I)V

    return-void
.end method
