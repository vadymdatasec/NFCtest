.class public final synthetic Le/h/b/a/l/j;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/BadgeListActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/j;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Le/h/b/a/l/j;->b:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-virtual {v0, p1, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->b(Landroid/content/DialogInterface;I)V

    return-void
.end method