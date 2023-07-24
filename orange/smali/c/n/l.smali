.class public Lc/n/l;
.super Lc/n/g;
.source "SourceFile"


# instance fields
.field public a:Lc/c/a/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/c/a/b/a<",
            "Lc/n/i;",
            "Lc/n/k;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lc/n/g$b;

.field public final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lc/n/j;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/n/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Z


# direct methods
.method public constructor <init>(Lc/n/j;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lc/n/l;-><init>(Lc/n/j;Z)V

    return-void
.end method

.method public constructor <init>(Lc/n/j;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lc/n/g;-><init>()V

    .line 3
    new-instance v0, Lc/c/a/b/a;

    invoke-direct {v0}, Lc/c/a/b/a;-><init>()V

    iput-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lc/n/l;->d:I

    .line 5
    iput-boolean v0, p0, Lc/n/l;->e:Z

    .line 6
    iput-boolean v0, p0, Lc/n/l;->f:Z

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/n/l;->g:Ljava/util/ArrayList;

    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lc/n/l;->c:Ljava/lang/ref/WeakReference;

    .line 9
    sget-object p1, Lc/n/g$b;->c:Lc/n/g$b;

    iput-object p1, p0, Lc/n/l;->b:Lc/n/g$b;

    .line 10
    iput-boolean p2, p0, Lc/n/l;->h:Z

    return-void
.end method

.method public static a(Lc/n/g$b;Lc/n/g$b;)Lc/n/g$b;
    .locals 1

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()Lc/n/g$b;
    .locals 1

    .line 23
    iget-object v0, p0, Lc/n/l;->b:Lc/n/g$b;

    return-object v0
.end method

.method public a(Lc/n/g$a;)V
    .locals 1

    const-string v0, "handleLifecycleEvent"

    .line 3
    invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lc/n/g$a;->a()Lc/n/g$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/n/l;->b(Lc/n/g$b;)V

    return-void
.end method

.method public a(Lc/n/g$b;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "markState"

    .line 1
    invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lc/n/l;->d(Lc/n/g$b;)V

    return-void
.end method

.method public a(Lc/n/i;)V
    .locals 6

    const-string v0, "addObserver"

    .line 5
    invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lc/n/l;->b:Lc/n/g$b;

    sget-object v1, Lc/n/g$b;->b:Lc/n/g$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lc/n/g$b;->c:Lc/n/g$b;

    .line 7
    :goto_0
    new-instance v0, Lc/n/k;

    invoke-direct {v0, p1, v1}, Lc/n/k;-><init>(Lc/n/i;Lc/n/g$b;)V

    .line 8
    iget-object v1, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v1, p1, v0}, Lc/c/a/b/a;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/n/k;

    if-eqz v1, :cond_1

    return-void

    .line 9
    :cond_1
    iget-object v1, p0, Lc/n/l;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/n/j;

    if-nez v1, :cond_2

    return-void

    .line 10
    :cond_2
    iget v2, p0, Lc/n/l;->d:I

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lc/n/l;->e:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v2, 0x1

    .line 11
    :goto_2
    invoke-virtual {p0, p1}, Lc/n/l;->c(Lc/n/i;)Lc/n/g$b;

    move-result-object v4

    .line 12
    iget v5, p0, Lc/n/l;->d:I

    add-int/2addr v5, v3

    iput v5, p0, Lc/n/l;->d:I

    .line 13
    :goto_3
    iget-object v5, v0, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_6

    iget-object v4, p0, Lc/n/l;->a:Lc/c/a/b/a;

    .line 14
    invoke-virtual {v4, p1}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 15
    iget-object v4, v0, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {p0, v4}, Lc/n/l;->c(Lc/n/g$b;)V

    .line 16
    iget-object v4, v0, Lc/n/k;->a:Lc/n/g$b;

    invoke-static {v4}, Lc/n/g$a;->b(Lc/n/g$b;)Lc/n/g$a;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 17
    invoke-virtual {v0, v1, v4}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V

    .line 18
    invoke-virtual {p0}, Lc/n/l;->c()V

    .line 19
    invoke-virtual {p0, p1}, Lc/n/l;->c(Lc/n/i;)Lc/n/g$b;

    move-result-object v4

    goto :goto_3

    .line 20
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event up from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v2, :cond_7

    .line 21
    invoke-virtual {p0}, Lc/n/l;->d()V

    .line 22
    :cond_7
    iget p1, p0, Lc/n/l;->d:I

    sub-int/2addr p1, v3

    iput p1, p0, Lc/n/l;->d:I

    return-void
.end method

.method public final a(Lc/n/j;)V
    .locals 5

    .line 24
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    .line 25
    invoke-virtual {v0}, Lc/c/a/b/e;->a()Ljava/util/Iterator;

    move-result-object v0

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lc/n/l;->f:Z

    if-nez v1, :cond_2

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/n/k;

    .line 29
    :goto_0
    iget-object v3, v2, Lc/n/k;->a:Lc/n/g$b;

    iget-object v4, p0, Lc/n/l;->b:Lc/n/g$b;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_0

    iget-boolean v3, p0, Lc/n/l;->f:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Lc/n/l;->a:Lc/c/a/b/a;

    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 31
    iget-object v3, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-static {v3}, Lc/n/g$a;->a(Lc/n/g$b;)Lc/n/g$a;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 32
    invoke-virtual {v3}, Lc/n/g$a;->a()Lc/n/g$b;

    move-result-object v4

    invoke-virtual {p0, v4}, Lc/n/l;->c(Lc/n/g$b;)V

    .line 33
    invoke-virtual {v2, p1, v3}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V

    .line 34
    invoke-virtual {p0}, Lc/n/l;->c()V

    goto :goto_0

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event down from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .line 36
    iget-boolean v0, p0, Lc/n/l;->h:Z

    if-eqz v0, :cond_1

    .line 37
    invoke-static {}, Lc/c/a/a/c;->b()Lc/c/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lc/c/a/a/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be called on the main thread"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Lc/n/g$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/n/l;->b:Lc/n/g$b;

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lc/n/l;->b:Lc/n/g$b;

    .line 3
    iget-boolean p1, p0, Lc/n/l;->e:Z

    const/4 v0, 0x1

    if-nez p1, :cond_2

    iget p1, p0, Lc/n/l;->d:I

    if-eqz p1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iput-boolean v0, p0, Lc/n/l;->e:Z

    .line 5
    invoke-virtual {p0}, Lc/n/l;->d()V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lc/n/l;->e:Z

    return-void

    .line 7
    :cond_2
    :goto_0
    iput-boolean v0, p0, Lc/n/l;->f:Z

    return-void
.end method

.method public b(Lc/n/i;)V
    .locals 1

    const-string v0, "removeObserver"

    .line 12
    invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v0, p1}, Lc/c/a/b/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lc/n/j;)V
    .locals 5

    .line 14
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    .line 15
    invoke-virtual {v0}, Lc/c/a/b/e;->c()Lc/c/a/b/e$a;

    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lc/n/l;->f:Z

    if-nez v1, :cond_2

    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 18
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/n/k;

    .line 19
    :goto_0
    iget-object v3, v2, Lc/n/k;->a:Lc/n/g$b;

    iget-object v4, p0, Lc/n/l;->b:Lc/n/g$b;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    iget-boolean v3, p0, Lc/n/l;->f:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Lc/n/l;->a:Lc/c/a/b/a;

    .line 20
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 21
    iget-object v3, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {p0, v3}, Lc/n/l;->c(Lc/n/g$b;)V

    .line 22
    iget-object v3, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-static {v3}, Lc/n/g$a;->b(Lc/n/g$b;)Lc/n/g$a;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 23
    invoke-virtual {v2, p1, v3}, Lc/n/k;->a(Lc/n/j;Lc/n/g$a;)V

    .line 24
    invoke-virtual {p0}, Lc/n/l;->c()V

    goto :goto_0

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event up from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final b()Z
    .locals 3

    .line 8
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v0}, Lc/c/a/b/e;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v0}, Lc/c/a/b/e;->b()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/n/k;

    iget-object v0, v0, Lc/n/k;->a:Lc/n/g$b;

    .line 10
    iget-object v2, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v2}, Lc/c/a/b/e;->d()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/n/k;

    iget-object v2, v2, Lc/n/k;->a:Lc/n/g$b;

    if-ne v0, v2, :cond_1

    .line 11
    iget-object v0, p0, Lc/n/l;->b:Lc/n/g$b;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final c(Lc/n/i;)Lc/n/g$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v0, p1}, Lc/c/a/b/a;->b(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/n/k;

    iget-object p1, p1, Lc/n/k;->a:Lc/n/g$b;

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 3
    :goto_0
    iget-object v1, p0, Lc/n/l;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lc/n/l;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/n/g$b;

    .line 4
    :cond_1
    iget-object v1, p0, Lc/n/l;->b:Lc/n/g$b;

    invoke-static {v1, p1}, Lc/n/l;->a(Lc/n/g$b;Lc/n/g$b;)Lc/n/g$b;

    move-result-object p1

    invoke-static {p1, v0}, Lc/n/l;->a(Lc/n/g$b;Lc/n/g$b;)Lc/n/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 2

    .line 5
    iget-object v0, p0, Lc/n/l;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final c(Lc/n/g$b;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lc/n/l;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 3

    .line 3
    iget-object v0, p0, Lc/n/l;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/n/j;

    if-eqz v0, :cond_3

    .line 4
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lc/n/l;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 5
    iput-boolean v2, p0, Lc/n/l;->f:Z

    .line 6
    iget-object v1, p0, Lc/n/l;->b:Lc/n/g$b;

    iget-object v2, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v2}, Lc/c/a/b/e;->b()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/n/k;

    iget-object v2, v2, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_1

    .line 7
    invoke-virtual {p0, v0}, Lc/n/l;->a(Lc/n/j;)V

    .line 8
    :cond_1
    iget-object v1, p0, Lc/n/l;->a:Lc/c/a/b/a;

    invoke-virtual {v1}, Lc/c/a/b/e;->d()Ljava/util/Map$Entry;

    move-result-object v1

    .line 9
    iget-boolean v2, p0, Lc/n/l;->f:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lc/n/l;->b:Lc/n/g$b;

    .line 10
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/n/k;

    iget-object v1, v1, Lc/n/k;->a:Lc/n/g$b;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    .line 11
    invoke-virtual {p0, v0}, Lc/n/l;->b(Lc/n/j;)V

    goto :goto_0

    .line 12
    :cond_2
    iput-boolean v2, p0, Lc/n/l;->f:Z

    return-void

    .line 13
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lc/n/g$b;)V
    .locals 1

    const-string v0, "setCurrentState"

    .line 1
    invoke-virtual {p0, v0}, Lc/n/l;->a(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lc/n/l;->b(Lc/n/g$b;)V

    return-void
.end method
