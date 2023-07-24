.class public Landroidx/fragment/app/FragmentManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc/l/d/v1;

.field public final synthetic c:Lc/n/g;

.field public final synthetic d:Lc/l/d/o1;


# virtual methods
.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 2

    .line 1
    sget-object p1, Lc/n/g$a;->ON_START:Lc/n/g$a;

    if-ne p2, p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->d:Lc/l/d/o1;

    invoke-static {p1}, Lc/l/d/o1;->a(Lc/l/d/o1;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->b:Lc/l/d/v1;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$6;->a:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lc/l/d/v1;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->d:Lc/l/d/o1;

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lc/l/d/o1;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    sget-object p1, Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;

    if-ne p2, p1, :cond_1

    .line 6
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->c:Lc/n/g;

    invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V

    .line 7
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->d:Lc/l/d/o1;

    invoke-static {p1}, Lc/l/d/o1;->b(Lc/l/d/o1;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Landroidx/fragment/app/FragmentManager$6;->a:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
