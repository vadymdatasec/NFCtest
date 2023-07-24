.class public final enum Lm/b/j/c;
.super Lm/b/j/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/b0;-><init>(Ljava/lang/String;ILm/b/j/m;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 10

    .line 1
    sget-object v0, Lm/b/j/r;->a:[I

    iget-object v1, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x5

    if-eq v0, v3, :cond_4

    .line 2
    invoke-virtual {p2}, Lm/b/j/b;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 3
    invoke-virtual {p2}, Lm/b/j/b;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 4
    invoke-static {v3}, Lm/b/j/b0;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 5
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 6
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v4

    invoke-virtual {v4}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    const-string v5, "table"

    const-string v6, "tbody"

    const-string v7, "tfoot"

    const-string v8, "thead"

    const-string v9, "tr"

    filled-new-array {v5, v6, v7, v8, v9}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 7
    invoke-virtual {p2, v1}, Lm/b/j/b;->b(Z)V

    .line 8
    new-instance v4, Lm/b/j/i0;

    invoke-direct {v4}, Lm/b/j/i0;-><init>()V

    invoke-virtual {v4, v3}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    sget-object v3, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, v4, v3}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    .line 9
    invoke-virtual {p2, v2}, Lm/b/j/b;->b(Z)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance v4, Lm/b/j/i0;

    invoke-direct {v4}, Lm/b/j/i0;-><init>()V

    invoke-virtual {v4, v3}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    sget-object v3, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, v4, v3}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    goto :goto_0

    .line 11
    :cond_1
    new-instance v4, Lm/b/j/i0;

    invoke-direct {v4}, Lm/b/j/i0;-><init>()V

    invoke-virtual {v4, v3}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    invoke-virtual {p2, v4}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p2}, Lm/b/j/b;->u()V

    .line 13
    :cond_3
    invoke-virtual {p2}, Lm/b/j/b;->v()Lm/b/j/b0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 14
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 15
    :cond_4
    invoke-virtual {p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lm/b/j/b0;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 17
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 18
    :cond_5
    invoke-virtual {p2}, Lm/b/j/b;->n()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v1
.end method
