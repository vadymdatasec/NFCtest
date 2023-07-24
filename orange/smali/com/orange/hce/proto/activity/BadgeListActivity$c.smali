.class public Lcom/orange/hce/proto/activity/BadgeListActivity$c;
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
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$c;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string p1, "zoneId"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    const-string v0, "contactlessId"

    .line 2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "rssiLevel"

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 4
    iget-object v1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$c;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Lcom/orange/hce/proto/activity/BadgeListActivity;)Le/h/b/a/l/y0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$c;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {v2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Lcom/orange/hce/proto/activity/BadgeListActivity;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    invoke-virtual {v1, v0, p1, p2}, Le/h/b/a/l/y0;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V

    :cond_0
    return-void
.end method
