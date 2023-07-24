.class public Lc/b/q/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/q/p1;


# direct methods
.method public constructor <init>(Lc/b/q/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    iget-object v0, v0, Lc/b/q/p1;->d:Lc/b/q/d1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    iget-object v0, v0, Lc/b/q/p1;->d:Lc/b/q/d1;

    .line 2
    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    iget-object v1, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    iget-object v1, v1, Lc/b/q/p1;->d:Lc/b/q/d1;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    iget-object v0, v0, Lc/b/q/p1;->d:Lc/b/q/d1;

    .line 3
    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    iget v2, v1, Lc/b/q/p1;->p:I

    if-gt v0, v2, :cond_0

    .line 4
    iget-object v0, v1, Lc/b/q/p1;->F:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 5
    iget-object v0, p0, Lc/b/q/o1;->b:Lc/b/q/p1;

    invoke-virtual {v0}, Lc/b/q/p1;->a()V

    :cond_0
    return-void
.end method
