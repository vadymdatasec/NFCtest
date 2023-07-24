.class public final Le/f/c/l/e/o/i0;
.super Le/f/c/l/e/o/l2;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Boolean;

.field public f:Le/f/c/l/e/o/k2;

.field public g:Le/f/c/l/e/o/l3;

.field public h:Le/f/c/l/e/o/j3;

.field public i:Le/f/c/l/e/o/n2;

.field public j:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/l2;-><init>()V

    return-void
.end method

.method public constructor <init>(Le/f/c/l/e/o/m3;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Le/f/c/l/e/o/l2;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->c:Ljava/lang/Long;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->c()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->d:Ljava/lang/Long;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->l()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->e:Ljava/lang/Boolean;

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->a()Le/f/c/l/e/o/k2;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->f:Le/f/c/l/e/o/k2;

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->k()Le/f/c/l/e/o/l3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->g:Le/f/c/l/e/o/l3;

    .line 11
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->i()Le/f/c/l/e/o/j3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->h:Le/f/c/l/e/o/j3;

    .line 12
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->b()Le/f/c/l/e/o/n2;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->i:Le/f/c/l/e/o/n2;

    .line 13
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->d()Le/f/c/l/e/o/p3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/i0;->j:Le/f/c/l/e/o/p3;

    .line 14
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/i0;->k:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/l/e/o/m3;Le/f/c/l/e/o/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/c/l/e/o/i0;-><init>(Le/f/c/l/e/o/m3;)V

    return-void
.end method


# virtual methods
.method public a(I)Le/f/c/l/e/o/l2;
    .locals 0

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/i0;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(J)Le/f/c/l/e/o/l2;
    .locals 0

    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/i0;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/j3;)Le/f/c/l/e/o/l2;
    .locals 0

    .line 9
    iput-object p1, p0, Le/f/c/l/e/o/i0;->h:Le/f/c/l/e/o/j3;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/k2;)Le/f/c/l/e/o/l2;
    .locals 1

    if-eqz p1, :cond_0

    .line 6
    iput-object p1, p0, Le/f/c/l/e/o/i0;->f:Le/f/c/l/e/o/k2;

    return-object p0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null app"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/l3;)Le/f/c/l/e/o/l2;
    .locals 0

    .line 8
    iput-object p1, p0, Le/f/c/l/e/o/i0;->g:Le/f/c/l/e/o/l3;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/n2;)Le/f/c/l/e/o/l2;
    .locals 0

    .line 10
    iput-object p1, p0, Le/f/c/l/e/o/i0;->i:Le/f/c/l/e/o/n2;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/l2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;)",
            "Le/f/c/l/e/o/l2;"
        }
    .end annotation

    .line 11
    iput-object p1, p0, Le/f/c/l/e/o/i0;->j:Le/f/c/l/e/o/p3;

    return-object p0
.end method

.method public a(Ljava/lang/Long;)Le/f/c/l/e/o/l2;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/c/l/e/o/i0;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/l/e/o/l2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/i0;->a:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null generator"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Z)Le/f/c/l/e/o/l2;
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/i0;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public a()Le/f/c/l/e/o/m3;
    .locals 17

    move-object/from16 v0, p0

    .line 13
    iget-object v1, v0, Le/f/c/l/e/o/i0;->a:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generator"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 15
    :cond_0
    iget-object v1, v0, Le/f/c/l/e/o/i0;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " identifier"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 17
    :cond_1
    iget-object v1, v0, Le/f/c/l/e/o/i0;->c:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startedAt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 19
    :cond_2
    iget-object v1, v0, Le/f/c/l/e/o/i0;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " crashed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 21
    :cond_3
    iget-object v1, v0, Le/f/c/l/e/o/i0;->f:Le/f/c/l/e/o/k2;

    if-nez v1, :cond_4

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " app"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 23
    :cond_4
    iget-object v1, v0, Le/f/c/l/e/o/i0;->k:Ljava/lang/Integer;

    if-nez v1, :cond_5

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generatorType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 25
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 26
    new-instance v1, Le/f/c/l/e/o/j0;

    iget-object v4, v0, Le/f/c/l/e/o/i0;->a:Ljava/lang/String;

    iget-object v5, v0, Le/f/c/l/e/o/i0;->b:Ljava/lang/String;

    iget-object v2, v0, Le/f/c/l/e/o/i0;->c:Ljava/lang/Long;

    .line 27
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, v0, Le/f/c/l/e/o/i0;->d:Ljava/lang/Long;

    iget-object v2, v0, Le/f/c/l/e/o/i0;->e:Ljava/lang/Boolean;

    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v10, v0, Le/f/c/l/e/o/i0;->f:Le/f/c/l/e/o/k2;

    iget-object v11, v0, Le/f/c/l/e/o/i0;->g:Le/f/c/l/e/o/l3;

    iget-object v12, v0, Le/f/c/l/e/o/i0;->h:Le/f/c/l/e/o/j3;

    iget-object v13, v0, Le/f/c/l/e/o/i0;->i:Le/f/c/l/e/o/n2;

    iget-object v14, v0, Le/f/c/l/e/o/i0;->j:Le/f/c/l/e/o/p3;

    iget-object v2, v0, Le/f/c/l/e/o/i0;->k:Ljava/lang/Integer;

    .line 29
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Le/f/c/l/e/o/j0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLe/f/c/l/e/o/k2;Le/f/c/l/e/o/l3;Le/f/c/l/e/o/j3;Le/f/c/l/e/o/n2;Le/f/c/l/e/o/p3;ILe/f/c/l/e/o/h0;)V

    return-object v1

    .line 30
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)Le/f/c/l/e/o/l2;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/i0;->b:Ljava/lang/String;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null identifier"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
