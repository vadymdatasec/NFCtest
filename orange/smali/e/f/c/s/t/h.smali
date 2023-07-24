.class public abstract Le/f/c/s/t/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Le/f/c/s/t/h;->p()Le/f/c/s/t/g;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static p()Le/f/c/s/t/g;
    .locals 4

    .line 1
    new-instance v0, Le/f/c/s/t/b;

    invoke-direct {v0}, Le/f/c/s/t/b;-><init>()V

    const-wide/16 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Le/f/c/s/t/b;->b(J)Le/f/c/s/t/g;

    sget-object v3, Le/f/c/s/t/e;->b:Le/f/c/s/t/e;

    .line 3
    invoke-virtual {v0, v3}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;

    .line 4
    invoke-virtual {v0, v1, v2}, Le/f/c/s/t/g;->a(J)Le/f/c/s/t/g;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le/f/c/s/t/h;
    .locals 1

    .line 9
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->c(Ljava/lang/String;)Le/f/c/s/t/g;

    sget-object p1, Le/f/c/s/t/e;->f:Le/f/c/s/t/e;

    .line 11
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;

    .line 12
    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;JJ)Le/f/c/s/t/h;
    .locals 1

    .line 13
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->a(Ljava/lang/String;)Le/f/c/s/t/g;

    .line 15
    invoke-virtual {v0, p2, p3}, Le/f/c/s/t/g;->a(J)Le/f/c/s/t/g;

    .line 16
    invoke-virtual {v0, p4, p5}, Le/f/c/s/t/g;->b(J)Le/f/c/s/t/g;

    .line 17
    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Le/f/c/s/t/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->b(Ljava/lang/String;)Le/f/c/s/t/g;

    sget-object p1, Le/f/c/s/t/e;->e:Le/f/c/s/t/e;

    .line 3
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;

    .line 4
    invoke-virtual {v0, p5}, Le/f/c/s/t/g;->a(Ljava/lang/String;)Le/f/c/s/t/g;

    .line 5
    invoke-virtual {v0, p2}, Le/f/c/s/t/g;->d(Ljava/lang/String;)Le/f/c/s/t/g;

    .line 6
    invoke-virtual {v0, p6, p7}, Le/f/c/s/t/g;->a(J)Le/f/c/s/t/g;

    .line 7
    invoke-virtual {v0, p3, p4}, Le/f/c/s/t/g;->b(J)Le/f/c/s/t/g;

    .line 8
    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()J
.end method

.method public b(Ljava/lang/String;)Le/f/c/s/t/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->b(Ljava/lang/String;)Le/f/c/s/t/g;

    sget-object p1, Le/f/c/s/t/e;->d:Le/f/c/s/t/e;

    .line 3
    invoke-virtual {v0, p1}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;

    .line 4
    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Le/f/c/s/t/e;
.end method

.method public abstract g()J
.end method

.method public h()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->f:Le/f/c/s/t/e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->c:Le/f/c/s/t/e;

    if-eq v0, v1, :cond_1

    .line 2
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->b:Le/f/c/s/t/e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public j()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->e:Le/f/c/s/t/e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->d:Le/f/c/s/t/e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->b:Le/f/c/s/t/e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract m()Le/f/c/s/t/g;
.end method

.method public n()Le/f/c/s/t/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/f/c/s/t/g;->a(Ljava/lang/String;)Le/f/c/s/t/g;

    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object v0

    return-object v0
.end method

.method public o()Le/f/c/s/t/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/s/t/h;->m()Le/f/c/s/t/g;

    move-result-object v0

    sget-object v1, Le/f/c/s/t/e;->c:Le/f/c/s/t/e;

    invoke-virtual {v0, v1}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;

    invoke-virtual {v0}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;

    move-result-object v0

    return-object v0
.end method
