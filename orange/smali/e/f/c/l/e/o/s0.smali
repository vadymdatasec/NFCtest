.class public final Le/f/c/l/e/o/s0;
.super Le/f/c/l/e/o/c3;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/String;

.field public c:Le/f/c/l/e/o/b3;

.field public d:Le/f/c/l/e/o/e3;

.field public e:Le/f/c/l/e/o/g3;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/c/l/e/o/c3;-><init>()V

    return-void
.end method

.method public constructor <init>(Le/f/c/l/e/o/h3;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Le/f/c/l/e/o/c3;-><init>()V

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/s0;->a:Ljava/lang/Long;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/s0;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->a()Le/f/c/l/e/o/b3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/s0;->c:Le/f/c/l/e/o/b3;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->b()Le/f/c/l/e/o/e3;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/o/s0;->d:Le/f/c/l/e/o/e3;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/h3;->c()Le/f/c/l/e/o/g3;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/s0;->e:Le/f/c/l/e/o/g3;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/c/l/e/o/h3;Le/f/c/l/e/o/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/c/l/e/o/s0;-><init>(Le/f/c/l/e/o/h3;)V

    return-void
.end method


# virtual methods
.method public a(J)Le/f/c/l/e/o/c3;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/o/s0;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    iput-object p1, p0, Le/f/c/l/e/o/s0;->c:Le/f/c/l/e/o/b3;

    return-object p0

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null app"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/e3;)Le/f/c/l/e/o/c3;
    .locals 1

    if-eqz p1, :cond_0

    .line 6
    iput-object p1, p0, Le/f/c/l/e/o/s0;->d:Le/f/c/l/e/o/e3;

    return-object p0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null device"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/c/l/e/o/g3;)Le/f/c/l/e/o/c3;
    .locals 0

    .line 8
    iput-object p1, p0, Le/f/c/l/e/o/s0;->e:Le/f/c/l/e/o/g3;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/c/l/e/o/c3;
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/c/l/e/o/s0;->b:Ljava/lang/String;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null type"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Le/f/c/l/e/o/h3;
    .locals 10

    .line 9
    iget-object v0, p0, Le/f/c/l/e/o/s0;->a:Ljava/lang/Long;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " timestamp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/o/s0;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/o/s0;->c:Le/f/c/l/e/o/b3;

    if-nez v0, :cond_2

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " app"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    :cond_2
    iget-object v0, p0, Le/f/c/l/e/o/s0;->d:Le/f/c/l/e/o/e3;

    if-nez v0, :cond_3

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " device"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 18
    new-instance v0, Le/f/c/l/e/o/t0;

    iget-object v1, p0, Le/f/c/l/e/o/s0;->a:Ljava/lang/Long;

    .line 19
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Le/f/c/l/e/o/s0;->b:Ljava/lang/String;

    iget-object v6, p0, Le/f/c/l/e/o/s0;->c:Le/f/c/l/e/o/b3;

    iget-object v7, p0, Le/f/c/l/e/o/s0;->d:Le/f/c/l/e/o/e3;

    iget-object v8, p0, Le/f/c/l/e/o/s0;->e:Le/f/c/l/e/o/g3;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Le/f/c/l/e/o/t0;-><init>(JLjava/lang/String;Le/f/c/l/e/o/b3;Le/f/c/l/e/o/e3;Le/f/c/l/e/o/g3;Le/f/c/l/e/o/r0;)V

    return-object v0

    .line 20
    :cond_4
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
