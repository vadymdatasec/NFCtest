.class public final Le/f/a/d/a/e/p;
.super Le/f/a/d/a/e/o;
.source "SourceFile"


# instance fields
.field public final b:Le/f/a/d/a/e/o;

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/o;JJ)V
    .locals 0

    invoke-direct {p0}, Le/f/a/d/a/e/o;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/e/p;->b:Le/f/a/d/a/e/o;

    invoke-virtual {p0, p2, p3}, Le/f/a/d/a/e/p;->g(J)J

    move-result-wide p1

    iput-wide p1, p0, Le/f/a/d/a/e/p;->c:J

    add-long/2addr p1, p4

    invoke-virtual {p0, p1, p2}, Le/f/a/d/a/e/p;->g(J)J

    move-result-wide p1

    iput-wide p1, p0, Le/f/a/d/a/e/p;->d:J

    return-void
.end method


# virtual methods
.method public final a(JJ)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide p1, p0, Le/f/a/d/a/e/p;->c:J

    invoke-virtual {p0, p1, p2}, Le/f/a/d/a/e/p;->g(J)J

    move-result-wide p1

    add-long/2addr p3, p1

    invoke-virtual {p0, p3, p4}, Le/f/a/d/a/e/p;->g(J)J

    move-result-wide p3

    iget-object v0, p0, Le/f/a/d/a/e/p;->b:Le/f/a/d/a/e/o;

    sub-long/2addr p3, p1

    invoke-virtual {v0, p1, p2, p3, p4}, Le/f/a/d/a/e/o;->a(JJ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final c()J
    .locals 4

    iget-wide v0, p0, Le/f/a/d/a/e/p;->d:J

    iget-wide v2, p0, Le/f/a/d/a/e/p;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public final g(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Le/f/a/d/a/e/p;->b:Le/f/a/d/a/e/o;

    invoke-virtual {v0}, Le/f/a/d/a/e/o;->c()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    iget-object p1, p0, Le/f/a/d/a/e/p;->b:Le/f/a/d/a/e/o;

    invoke-virtual {p1}, Le/f/a/d/a/e/o;->c()J

    move-result-wide p1

    :cond_1
    return-wide p1
.end method
