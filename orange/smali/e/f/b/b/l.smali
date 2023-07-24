.class public final Le/f/b/b/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Le/f/b/b/x;

.field public e:Le/f/b/b/x;

.field public f:Le/f/b/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/a/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Le/f/b/b/l;->b:I

    .line 3
    iput v0, p0, Le/f/b/b/l;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget v0, p0, Le/f/b/b/l;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x4

    :cond_0
    return v0
.end method

.method public a(Le/f/b/b/x;)Le/f/b/b/l;
    .locals 4

    .line 2
    iget-object v0, p0, Le/f/b/b/l;->d:Le/f/b/b/x;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Le/f/b/b/l;->d:Le/f/b/b/x;

    const-string v3, "Key strength was already set to %s"

    invoke-static {v0, v3, v2}, Le/f/b/a/p;->b(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Le/f/b/b/x;

    iput-object v0, p0, Le/f/b/b/l;->d:Le/f/b/b/x;

    .line 4
    sget-object v0, Le/f/b/b/x;->b:Le/f/b/b/x;

    if-eq p1, v0, :cond_1

    .line 5
    iput-boolean v1, p0, Le/f/b/b/l;->a:Z

    :cond_1
    return-object p0
.end method

.method public b()I
    .locals 2

    .line 1
    iget v0, p0, Le/f/b/b/l;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    :cond_0
    return v0
.end method

.method public c()Le/f/b/a/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/a/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/l;->f:Le/f/b/a/d;

    invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;

    move-result-object v1

    invoke-virtual {v1}, Le/f/b/b/x;->a()Le/f/b/a/d;

    move-result-object v1

    invoke-static {v0, v1}, Le/f/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/b/a/d;

    return-object v0
.end method

.method public d()Le/f/b/b/x;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/b/b/l;->d:Le/f/b/b/x;

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    invoke-static {v0, v1}, Le/f/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/b/b/x;

    return-object v0
.end method

.method public e()Le/f/b/b/x;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/b/b/l;->e:Le/f/b/b/x;

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    invoke-static {v0, v1}, Le/f/b/a/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/b/b/x;

    return-object v0
.end method

.method public f()Ljava/util/concurrent/ConcurrentMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/concurrent/ConcurrentMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/f/b/b/l;->a:Z

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Le/f/b/b/l;->b()I

    move-result v1

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-virtual {p0}, Le/f/b/b/l;->a()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    return-object v0

    .line 3
    :cond_0
    invoke-static {p0}, Le/f/b/b/q;->a(Le/f/b/b/l;)Le/f/b/b/q;

    move-result-object v0

    return-object v0
.end method

.method public g()Le/f/b/b/l;
    .locals 1

    .line 1
    sget-object v0, Le/f/b/b/x;->c:Le/f/b/b/x;

    invoke-virtual {p0, v0}, Le/f/b/b/l;->a(Le/f/b/b/x;)Le/f/b/b/l;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Le/f/b/a/j;->a(Ljava/lang/Object;)Le/f/b/a/j$a;

    move-result-object v0

    .line 2
    iget v1, p0, Le/f/b/b/l;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v3, "initialCapacity"

    .line 3
    invoke-virtual {v0, v3, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    .line 4
    :cond_0
    iget v1, p0, Le/f/b/b/l;->c:I

    if-eq v1, v2, :cond_1

    const-string v2, "concurrencyLevel"

    .line 5
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    .line 6
    :cond_1
    iget-object v1, p0, Le/f/b/b/l;->d:Le/f/b/b/x;

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/f/b/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyStrength"

    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 8
    :cond_2
    iget-object v1, p0, Le/f/b/b/l;->e:Le/f/b/b/x;

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/f/b/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "valueStrength"

    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 10
    :cond_3
    iget-object v1, p0, Le/f/b/b/l;->f:Le/f/b/a/d;

    if-eqz v1, :cond_4

    const-string v1, "keyEquivalence"

    .line 11
    invoke-virtual {v0, v1}, Le/f/b/a/j$a;->b(Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 12
    :cond_4
    invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
