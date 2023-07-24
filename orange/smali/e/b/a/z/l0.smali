.class public Le/b/a/z/l0;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b/a/z/l0$a;
    }
.end annotation


# instance fields
.field public final Z:Le/b/a/z/a;

.field public final a0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/b/a/z/l0;",
            ">;"
        }
    .end annotation
.end field

.field public b0:Le/b/a/z/l0;

.field public c0:Le/b/a/u;

.field public d0:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/z/a;

    invoke-direct {v0}, Le/b/a/z/a;-><init>()V

    invoke-direct {p0, v0}, Le/b/a/z/l0;-><init>(Le/b/a/z/a;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/z/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 3
    new-instance v0, Le/b/a/z/l0$a;

    invoke-direct {v0, p0}, Le/b/a/z/l0$a;-><init>(Le/b/a/z/l0;)V

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/b/a/z/l0;->a0:Ljava/util/Set;

    .line 5
    iput-object p1, p0, Le/b/a/z/l0;->Z:Le/b/a/z/a;

    return-void
.end method

.method public static d(Landroidx/fragment/app/Fragment;)Lc/l/d/o1;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;

    move-result-object p0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u()Lc/l/d/o1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A0()Le/b/a/z/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->Z:Le/b/a/z/a;

    return-object v0
.end method

.method public final B0()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Le/b/a/z/l0;->d0:Landroidx/fragment/app/Fragment;

    :goto_0
    return-object v0
.end method

.method public C0()Le/b/a/u;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->c0:Le/b/a/u;

    return-object v0
.end method

.method public final D0()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Le/b/a/z/l0;->b(Le/b/a/z/l0;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    .line 8
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;)V

    .line 9
    invoke-static {p0}, Le/b/a/z/l0;->d(Landroidx/fragment/app/Fragment;)Lc/l/d/o1;

    move-result-object p1

    const/4 v0, 0x5

    const-string v1, "SupportRMFragment"

    if-nez p1, :cond_1

    .line 10
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Unable to register fragment with root, ancestor detached"

    .line 11
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    .line 12
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0, v2, p1}, Le/b/a/z/l0;->a(Landroid/content/Context;Lc/l/d/o1;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Unable to register fragment with root"

    .line 14
    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Landroid/content/Context;Lc/l/d/o1;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Le/b/a/z/l0;->D0()V

    .line 3
    invoke-static {p1}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Le/b/a/d;->h()Le/b/a/z/v;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Le/b/a/z/v;->a(Lc/l/d/o1;)Le/b/a/z/l0;

    move-result-object p1

    iput-object p1, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    .line 6
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    iget-object p1, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    invoke-virtual {p1, p0}, Le/b/a/z/l0;->a(Le/b/a/z/l0;)V

    :cond_0
    return-void
.end method

.method public final a(Le/b/a/z/l0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->a0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Le/b/a/z/l0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->a0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Landroidx/fragment/app/Fragment;)Z
    .locals 2

    .line 2
    invoke-virtual {p0}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->b0()V

    .line 2
    iget-object v0, p0, Le/b/a/z/l0;->Z:Le/b/a/z/a;

    invoke-virtual {v0}, Le/b/a/z/a;->a()V

    .line 3
    invoke-virtual {p0}, Le/b/a/z/l0;->D0()V

    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iput-object p1, p0, Le/b/a/z/l0;->d0:Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Le/b/a/z/l0;->d(Landroidx/fragment/app/Fragment;)Lc/l/d/o1;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Le/b/a/z/l0;->a(Landroid/content/Context;Lc/l/d/o1;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public e0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->e0()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/b/a/z/l0;->d0:Landroidx/fragment/app/Fragment;

    .line 3
    invoke-virtual {p0}, Le/b/a/z/l0;->D0()V

    return-void
.end method

.method public h0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->h0()V

    .line 2
    iget-object v0, p0, Le/b/a/z/l0;->Z:Le/b/a/z/a;

    invoke-virtual {v0}, Le/b/a/z/a;->b()V

    return-void
.end method

.method public i0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->i0()V

    .line 2
    iget-object v0, p0, Le/b/a/z/l0;->Z:Le/b/a/z/a;

    invoke-virtual {v0}, Le/b/a/z/a;->c()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z0()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Le/b/a/z/l0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Le/b/a/z/l0;->a0:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    iget-object v1, p0, Le/b/a/z/l0;->b0:Le/b/a/z/l0;

    invoke-virtual {v1}, Le/b/a/z/l0;->z0()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/z/l0;

    .line 7
    invoke-virtual {v2}, Le/b/a/z/l0;->B0()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {p0, v3}, Le/b/a/z/l0;->b(Landroidx/fragment/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 8
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
