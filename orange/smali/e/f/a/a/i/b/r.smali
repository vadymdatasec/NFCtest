.class public final Le/f/a/a/i/b/r;
.super Le/f/a/a/i/b/e0;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/Integer;

.field public c:Ljava/lang/Long;

.field public d:[B

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/Long;

.field public g:Le/f/a/a/i/b/m0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/i/b/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Le/f/a/a/i/b/e0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/a/a/i/b/r;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/a/a/i/b/m0;)Le/f/a/a/i/b/e0;
    .locals 0

    .line 5
    iput-object p1, p0, Le/f/a/a/i/b/r;->g:Le/f/a/a/i/b/m0;

    return-object p0
.end method

.method public a(Ljava/lang/Integer;)Le/f/a/a/i/b/e0;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/a/a/i/b/r;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/a/a/i/b/e0;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/a/a/i/b/r;->e:Ljava/lang/String;

    return-object p0
.end method

.method public a([B)Le/f/a/a/i/b/e0;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/a/a/i/b/r;->d:[B

    return-object p0
.end method

.method public a()Le/f/a/a/i/b/f0;
    .locals 14

    .line 6
    iget-object v0, p0, Le/f/a/a/i/b/r;->a:Ljava/lang/Long;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " eventTimeMs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    :cond_0
    iget-object v0, p0, Le/f/a/a/i/b/r;->c:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " eventUptimeMs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_1
    iget-object v0, p0, Le/f/a/a/i/b/r;->f:Ljava/lang/Long;

    if-nez v0, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " timezoneOffsetSeconds"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    new-instance v0, Le/f/a/a/i/b/s;

    iget-object v1, p0, Le/f/a/a/i/b/r;->a:Ljava/lang/Long;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Le/f/a/a/i/b/r;->b:Ljava/lang/Integer;

    iget-object v1, p0, Le/f/a/a/i/b/r;->c:Ljava/lang/Long;

    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, p0, Le/f/a/a/i/b/r;->d:[B

    iget-object v9, p0, Le/f/a/a/i/b/r;->e:Ljava/lang/String;

    iget-object v1, p0, Le/f/a/a/i/b/r;->f:Ljava/lang/Long;

    .line 16
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, p0, Le/f/a/a/i/b/r;->g:Le/f/a/a/i/b/m0;

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Le/f/a/a/i/b/s;-><init>(JLjava/lang/Integer;J[BLjava/lang/String;JLe/f/a/a/i/b/m0;Le/f/a/a/i/b/q;)V

    return-object v0

    .line 17
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

.method public b(J)Le/f/a/a/i/b/e0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/a/a/i/b/r;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public c(J)Le/f/a/a/i/b/e0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/a/a/i/b/r;->f:Ljava/lang/Long;

    return-object p0
.end method
