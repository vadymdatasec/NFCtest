.class public final Lm/b/k/d;
.super Lm/b/k/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lm/b/k/e;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lm/b/k/q0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lm/b/k/e;-><init>()V

    .line 2
    iget v0, p0, Lm/b/k/e;->b:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    new-instance v1, Lm/b/k/c;

    invoke-direct {v1, p1}, Lm/b/k/c;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 5
    :goto_0
    invoke-virtual {p0}, Lm/b/k/e;->b()V

    return-void
.end method

.method public varargs constructor <init>([Lm/b/k/q0;)V
    .locals 0

    .line 6
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lm/b/k/d;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/l;Lm/b/i/l;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget v2, p0, Lm/b/k/e;->b:I

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/k/q0;

    .line 3
    invoke-virtual {v2, p1, p2}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public b(Lm/b/k/q0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p0}, Lm/b/k/e;->b()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lm/b/k/e;->a:Ljava/util/ArrayList;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":or%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
