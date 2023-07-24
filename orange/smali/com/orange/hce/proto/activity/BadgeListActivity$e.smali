.class public Lcom/orange/hce/proto/activity/BadgeListActivity$e;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/BadgeListActivity;->I()V
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
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$e;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$e;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    if-eqz p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Lcom/orange/hce/proto/activity/BadgeListActivity;Z)Z

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method
