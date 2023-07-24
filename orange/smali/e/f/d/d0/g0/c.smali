.class public final Le/f/d/d0/g0/c;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/d/a0<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final a:Le/f/d/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/a0<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Le/f/d/d0/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/s<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/d/d0/g0/d;Le/f/d/q;Ljava/lang/reflect/Type;Le/f/d/a0;Le/f/d/d0/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Ljava/lang/reflect/Type;",
            "Le/f/d/a0<",
            "TE;>;",
            "Le/f/d/d0/s<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    .line 2
    new-instance p1, Le/f/d/d0/g0/v;

    invoke-direct {p1, p2, p4, p3}, Le/f/d/d0/g0/v;-><init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Le/f/d/d0/g0/c;->a:Le/f/d/a0;

    .line 3
    iput-object p5, p0, Le/f/d/d0/g0/c;->b:Le/f/d/d0/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/c;->a(Le/f/d/f0/c;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/c;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/c;",
            ")",
            "Ljava/util/Collection<",
            "TE;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Le/f/d/d0/g0/c;->b:Le/f/d/d0/s;

    invoke-interface {v0}, Le/f/d/d0/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 6
    invoke-virtual {p1}, Le/f/d/f0/c;->l()V

    .line 7
    :goto_0
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Le/f/d/d0/g0/c;->a:Le/f/d/a0;

    invoke-virtual {v1, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/c;->q()V

    return-object v0
.end method

.method public bridge synthetic a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/c;->a(Le/f/d/f0/g;Ljava/util/Collection;)V

    return-void
.end method

.method public a(Le/f/d/f0/g;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/g;",
            "Ljava/util/Collection<",
            "TE;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 11
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/g;->l()Le/f/d/f0/g;

    .line 13
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 14
    iget-object v1, p0, Le/f/d/d0/g0/c;->a:Le/f/d/a0;

    invoke-virtual {v1, p1, v0}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p1}, Le/f/d/f0/g;->n()Le/f/d/f0/g;

    return-void
.end method
