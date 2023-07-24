.class public final synthetic Le/h/b/a/l/o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/BadgeListActivity;

.field private final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/o;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    iput-object p2, p0, Le/h/b/a/l/o;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/o;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    iget-object v1, p0, Le/h/b/a/l/o;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Landroid/net/Uri;)V

    return-void
.end method
