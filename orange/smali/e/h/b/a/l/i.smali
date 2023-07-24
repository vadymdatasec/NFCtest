.class public final synthetic Le/h/b/a/l/i;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/BadgeListActivity;

.field private final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/i;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    iput-object p2, p0, Le/h/b/a/l/i;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/i;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    iget-object v1, p0, Le/h/b/a/l/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
