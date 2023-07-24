.class public Le/f/c/l/e/v/j/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/v/j/e;


# instance fields
.field public final a:Le/f/c/l/e/v/j/b;

.field public final b:Le/f/c/l/e/v/j/d;

.field public final c:Le/f/c/l/e/v/j/c;

.field public final d:J


# direct methods
.method public constructor <init>(JLe/f/c/l/e/v/j/b;Le/f/c/l/e/v/j/d;Le/f/c/l/e/v/j/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Le/f/c/l/e/v/j/f;->d:J

    .line 3
    iput-object p3, p0, Le/f/c/l/e/v/j/f;->a:Le/f/c/l/e/v/j/b;

    .line 4
    iput-object p4, p0, Le/f/c/l/e/v/j/f;->b:Le/f/c/l/e/v/j/d;

    .line 5
    iput-object p5, p0, Le/f/c/l/e/v/j/f;->c:Le/f/c/l/e/v/j/c;

    return-void
.end method


# virtual methods
.method public a()Le/f/c/l/e/v/j/d;
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/l/e/v/j/f;->b:Le/f/c/l/e/v/j/d;

    return-object v0
.end method

.method public a(J)Z
    .locals 3

    .line 1
    iget-wide v0, p0, Le/f/c/l/e/v/j/f;->d:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Le/f/c/l/e/v/j/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/v/j/f;->c:Le/f/c/l/e/v/j/c;

    return-object v0
.end method

.method public c()Le/f/c/l/e/v/j/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/v/j/f;->a:Le/f/c/l/e/v/j/b;

    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/c/l/e/v/j/f;->d:J

    return-wide v0
.end method
