.class public final synthetic Le/h/b/a/l/r0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/StateImageButton;

.field private final synthetic c:Landroid/view/View$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/StateImageButton;Landroid/view/View$OnClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/r0;->b:Lcom/orange/hce/proto/activity/StateImageButton;

    iput-object p2, p0, Le/h/b/a/l/r0;->c:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/r0;->b:Lcom/orange/hce/proto/activity/StateImageButton;

    iget-object v1, p0, Le/h/b/a/l/r0;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1, p1}, Lcom/orange/hce/proto/activity/StateImageButton;->a(Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method
