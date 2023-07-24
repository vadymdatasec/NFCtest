.class public Lcom/orange/hce/proto/activity/PermissionsActivity$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/hce/proto/activity/PermissionsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/activity/PermissionsActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;->a:Lcom/orange/hce/proto/activity/PermissionsActivity;

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

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;->a:Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Lcom/orange/hce/proto/activity/PermissionsActivity;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V

    .line 4
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;->a:Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->b(Lcom/orange/hce/proto/activity/PermissionsActivity;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;->a:Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-virtual {p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;->a:Lcom/orange/hce/proto/activity/PermissionsActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Lcom/orange/hce/proto/activity/PermissionsActivity;Z)Z

    :cond_1
    return-void
.end method
