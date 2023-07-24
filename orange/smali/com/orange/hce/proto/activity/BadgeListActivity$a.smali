.class public Lcom/orange/hce/proto/activity/BadgeListActivity$a;
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
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$a;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

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

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$a;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-virtual {p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->O()V

    .line 4
    iget-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$a;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-virtual {p1}, Lc/b/k/r;->invalidateOptionsMenu()V

    :cond_0
    return-void
.end method
