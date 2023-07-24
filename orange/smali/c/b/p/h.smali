.class public Lc/b/p/h;
.super Landroid/view/ActionMode;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lc/b/p/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc/b/p/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 2
    iput-object p1, p0, Lc/b/p/h;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lc/b/p/h;->b:Lc/b/p/c;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->a()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->b()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    .line 1
    new-instance v0, Lc/b/p/o/b0;

    iget-object v1, p0, Lc/b/p/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v2}, Lc/b/p/c;->c()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, Lc/h/h/a/a;

    invoke-direct {v0, v1, v2}, Lc/b/p/o/b0;-><init>(Landroid/content/Context;Lc/h/h/a/a;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->d()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->e()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->h()Z

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->i()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0}, Lc/b/p/c;->j()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->a(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->a(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->b(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/h;->b:Lc/b/p/c;

    invoke-virtual {v0, p1}, Lc/b/p/c;->a(Z)V

    return-void
.end method
