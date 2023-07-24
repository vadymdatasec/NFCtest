.class public final Le/f/a/a/i/b/u;
.super Le/f/a/a/i/b/g0;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/Long;

.field public c:Le/f/a/a/i/b/d0;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/String;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/a/a/i/b/f0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Le/f/a/a/i/b/n0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/i/b/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Le/f/a/a/i/b/g0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/a/a/i/b/u;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public a(Le/f/a/a/i/b/d0;)Le/f/a/a/i/b/g0;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/a/a/i/b/u;->c:Le/f/a/a/i/b/d0;

    return-object p0
.end method

.method public a(Le/f/a/a/i/b/n0;)Le/f/a/a/i/b/g0;
    .locals 0

    .line 6
    iput-object p1, p0, Le/f/a/a/i/b/u;->g:Le/f/a/a/i/b/n0;

    return-object p0
.end method

.method public a(Ljava/lang/Integer;)Le/f/a/a/i/b/g0;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/a/a/i/b/u;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/f/a/a/i/b/g0;
    .locals 0

    .line 4
    iput-object p1, p0, Le/f/a/a/i/b/u;->e:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Le/f/a/a/i/b/g0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/f/a/a/i/b/f0;",
            ">;)",
            "Le/f/a/a/i/b/g0;"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Le/f/a/a/i/b/u;->f:Ljava/util/List;

    return-object p0
.end method

.method public a()Le/f/a/a/i/b/h0;
    .locals 13

    .line 7
    iget-object v0, p0, Le/f/a/a/i/b/u;->a:Ljava/lang/Long;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " requestTimeMs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Le/f/a/a/i/b/u;->b:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " requestUptimeMs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    new-instance v0, Le/f/a/a/i/b/v;

    iget-object v1, p0, Le/f/a/a/i/b/u;->a:Ljava/lang/Long;

    .line 13
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, p0, Le/f/a/a/i/b/u;->b:Ljava/lang/Long;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, p0, Le/f/a/a/i/b/u;->c:Le/f/a/a/i/b/d0;

    iget-object v8, p0, Le/f/a/a/i/b/u;->d:Ljava/lang/Integer;

    iget-object v9, p0, Le/f/a/a/i/b/u;->e:Ljava/lang/String;

    iget-object v10, p0, Le/f/a/a/i/b/u;->f:Ljava/util/List;

    iget-object v11, p0, Le/f/a/a/i/b/u;->g:Le/f/a/a/i/b/n0;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Le/f/a/a/i/b/v;-><init>(JJLe/f/a/a/i/b/d0;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Le/f/a/a/i/b/n0;Le/f/a/a/i/b/t;)V

    return-object v0

    .line 15
    :cond_2
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

.method public b(J)Le/f/a/a/i/b/g0;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Le/f/a/a/i/b/u;->b:Ljava/lang/Long;

    return-object p0
.end method
