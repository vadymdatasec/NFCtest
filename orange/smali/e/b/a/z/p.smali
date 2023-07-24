.class public final Le/b/a/z/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/w;


# instance fields
.field public final a:Lc/l/d/o1;

.field public final synthetic b:Le/b/a/z/q;


# direct methods
.method public constructor <init>(Le/b/a/z/q;Lc/l/d/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/p;->b:Le/b/a/z/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/b/a/z/p;->a:Lc/l/d/o1;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Le/b/a/u;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2
    iget-object v1, p0, Le/b/a/z/p;->a:Lc/l/d/o1;

    invoke-virtual {p0, v1, v0}, Le/b/a/z/p;->a(Lc/l/d/o1;Ljava/util/Set;)V

    return-object v0
.end method

.method public final a(Lc/l/d/o1;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/o1;",
            "Ljava/util/Set<",
            "Le/b/a/u;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Lc/l/d/o1;->z()Ljava/util/List;

    move-result-object p1

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 5
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 6
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;

    move-result-object v3

    invoke-virtual {p0, v3, p2}, Le/b/a/z/p;->a(Lc/l/d/o1;Ljava/util/Set;)V

    .line 7
    iget-object v3, p0, Le/b/a/z/p;->b:Le/b/a/z/q;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->g()Lc/n/g;

    move-result-object v2

    invoke-virtual {v3, v2}, Le/b/a/z/q;->a(Lc/n/g;)Le/b/a/u;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {p2, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
