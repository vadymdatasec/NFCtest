.class public final Le/e/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/e/a/o;


# direct methods
.method public constructor <init>(Le/e/a/o;)V
    .locals 0

    iput-object p1, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v0}, Le/e/a/o;->h(Le/e/a/o;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    check-cast v0, Landroid/view/View;

    .line 2
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->e(Le/e/a/o;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3
    sget-object v2, Le/e/a/z;->a:Le/e/a/z;

    iget-object v3, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v3}, Le/e/a/o;->d(Le/e/a/o;)Ljava/lang/ref/WeakReference;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "mActivity.get()!!"

    invoke-static {v3, v4}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/Activity;

    const-string v4, "target"

    invoke-static {v0, v4}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v0}, Le/e/a/z;->b(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->e(Le/e/a/o;)Ljava/util/List;

    move-result-object v2

    sget-object v3, Le/e/a/g;->b:Le/e/a/g;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->e(Le/e/a/o;)Ljava/util/List;

    move-result-object v2

    sget-object v3, Le/e/a/g;->c:Le/e/a/g;

    :goto_0
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->b(Le/e/a/o;)Le/e/a/b;

    move-result-object v3

    invoke-static {v2, v3}, Le/e/a/o;->a(Le/e/a/o;Le/e/a/b;)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 6
    :cond_2
    :goto_1
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2, v0}, Le/e/a/o;->a(Le/e/a/o;Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 7
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->a(Le/e/a/o;)Landroid/widget/RelativeLayout;

    move-result-object v3

    invoke-static {v2, v0, v3}, Le/e/a/o;->a(Le/e/a/o;Landroid/view/View;Landroid/widget/RelativeLayout;)V

    .line 8
    iget-object v2, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v2}, Le/e/a/o;->c(Le/e/a/o;)Le/e/a/b;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v1, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-static {v1}, Le/e/a/o;->a(Le/e/a/o;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-static {v2, v0, v3, v1}, Le/e/a/o;->a(Le/e/a/o;Landroid/view/View;Le/e/a/b;Landroid/widget/RelativeLayout;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 9
    :cond_4
    iget-object v0, p0, Le/e/a/n;->b:Le/e/a/o;

    invoke-virtual {v0}, Le/e/a/o;->b()V

    :goto_2
    return-void

    .line 10
    :cond_5
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method
