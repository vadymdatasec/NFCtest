.class public final Le/f/c/s/t/b;
.super Le/f/c/s/t/g;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Le/f/c/s/t/e;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Long;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/s/t/g;-><init>()V

    return-void
.end method

.method public constructor <init>(Le/f/c/s/t/h;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Le/f/c/s/t/g;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->a:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->b:Le/f/c/s/t/e;

    .line 6
    invoke-virtual {p1}, Le/f/c/s/t/h;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->c:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->d:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Le/f/c/s/t/h;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->e:Ljava/lang/Long;

    .line 9
    invoke-virtual {p1}, Le/f/c/s/t/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Le/f/c/s/t/b;->f:Ljava/lang/Long;

    .line 10
    invoke-virtual {p1}, Le/f/c/s/t/h;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/f/c/s/t/b;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/s/t/h;Le/f/c/s/t/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/c/s/t/b;-><init>(Le/f/c/s/t/h;)V

    return-void
.end method


# virtual methods
.method public a(J)Le/f/c/s/t/g;
    .locals 0

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/c/s/t/b;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/c/s/t/e;)Le/f/c/s/t/g;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/s/t/b;->b:Le/f/c/s/t/e;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null registrationStatus"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;)Le/f/c/s/t/g;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/c/s/t/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/f/c/s/t/h;
    .locals 13

    .line 5
    iget-object v0, p0, Le/f/c/s/t/b;->b:Le/f/c/s/t/e;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " registrationStatus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Le/f/c/s/t/b;->e:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " expiresInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :cond_1
    iget-object v0, p0, Le/f/c/s/t/b;->f:Ljava/lang/Long;

    if-nez v0, :cond_2

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " tokenCreationEpochInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    new-instance v0, Le/f/c/s/t/c;

    iget-object v3, p0, Le/f/c/s/t/b;->a:Ljava/lang/String;

    iget-object v4, p0, Le/f/c/s/t/b;->b:Le/f/c/s/t/e;

    iget-object v5, p0, Le/f/c/s/t/b;->c:Ljava/lang/String;

    iget-object v6, p0, Le/f/c/s/t/b;->d:Ljava/lang/String;

    iget-object v1, p0, Le/f/c/s/t/b;->e:Ljava/lang/Long;

    .line 13
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v1, p0, Le/f/c/s/t/b;->f:Ljava/lang/Long;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v11, p0, Le/f/c/s/t/b;->g:Ljava/lang/String;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Le/f/c/s/t/c;-><init>(Ljava/lang/String;Le/f/c/s/t/e;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Le/f/c/s/t/a;)V

    return-object v0

    .line 15
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(J)Le/f/c/s/t/g;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/c/s/t/b;->f:Ljava/lang/Long;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Le/f/c/s/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/t/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Le/f/c/s/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/t/b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Le/f/c/s/t/g;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/s/t/b;->d:Ljava/lang/String;

    return-object p0
.end method
