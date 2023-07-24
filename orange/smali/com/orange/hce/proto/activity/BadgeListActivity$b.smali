.class public Lcom/orange/hce/proto/activity/BadgeListActivity$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/hce/proto/activity/BadgeListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/activity/BadgeListActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$b;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.nfc.action.ADAPTER_STATE_CHANGED"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    const-string v0, "android.nfc.extra.ADAPTER_STATE"

    .line 3
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$b;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    const/4 v1, 0x3

    if-ne v1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->c(Z)V

    :cond_1
    return-void
.end method
