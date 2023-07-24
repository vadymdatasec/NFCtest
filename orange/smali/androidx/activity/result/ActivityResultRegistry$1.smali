.class public Landroidx/activity/result/ActivityResultRegistry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc/a/k/c;

.field public final synthetic c:Lc/a/k/i/a;

.field public final synthetic d:Lc/a/k/f;


# virtual methods
.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 3

    .line 1
    sget-object p1, Lc/n/g$a;->ON_START:Lc/n/g$a;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p1, p1, Lc/a/k/f;->f:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    new-instance v0, Lc/a/k/f$a;

    iget-object v1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->b:Lc/a/k/c;

    iget-object v2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->c:Lc/a/k/i/a;

    invoke-direct {v0, v1, v2}, Lc/a/k/f$a;-><init>(Lc/a/k/c;Lc/a/k/i/a;)V

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p1, p1, Lc/a/k/f;->g:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p1, p1, Lc/a/k/f;->g:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 5
    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p2, p2, Lc/a/k/f;->g:Ljava/util/Map;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->b:Lc/a/k/c;

    invoke-interface {p2, p1}, Lc/a/k/c;->a(Ljava/lang/Object;)V

    .line 7
    :cond_0
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p1, p1, Lc/a/k/f;->h:Landroid/os/Bundle;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lc/a/k/b;

    if-eqz p1, :cond_3

    .line 8
    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p2, p2, Lc/a/k/f;->h:Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 9
    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->b:Lc/a/k/c;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultRegistry$1;->c:Lc/a/k/i/a;

    .line 10
    invoke-virtual {p1}, Lc/a/k/b;->b()I

    move-result v1

    .line 11
    invoke-virtual {p1}, Lc/a/k/b;->a()Landroid/content/Intent;

    move-result-object p1

    .line 12
    invoke-virtual {v0, v1, p1}, Lc/a/k/i/a;->a(ILandroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lc/a/k/c;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 13
    :cond_1
    sget-object p1, Lc/n/g$a;->ON_STOP:Lc/n/g$a;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 14
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p1, p1, Lc/a/k/f;->f:Ljava/util/Map;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 15
    :cond_2
    sget-object p1, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 16
    iget-object p1, p0, Landroidx/activity/result/ActivityResultRegistry$1;->d:Lc/a/k/f;

    iget-object p2, p0, Landroidx/activity/result/ActivityResultRegistry$1;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lc/a/k/f;->b(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
