.class public final synthetic Le/f/a/d/a/b/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/b/k1;


# instance fields
.field public final a:Le/f/a/d/a/b/l1;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/l1;Ljava/lang/String;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/c1;->a:Le/f/a/d/a/b/l1;

    iput-object p2, p0, Le/f/a/d/a/b/c1;->b:Ljava/lang/String;

    iput p3, p0, Le/f/a/d/a/b/c1;->c:I

    iput-wide p4, p0, Le/f/a/d/a/b/c1;->d:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le/f/a/d/a/b/c1;->a:Le/f/a/d/a/b/l1;

    iget-object v1, p0, Le/f/a/d/a/b/c1;->b:Ljava/lang/String;

    iget v2, p0, Le/f/a/d/a/b/c1;->c:I

    iget-wide v3, p0, Le/f/a/d/a/b/c1;->d:J

    invoke-virtual {v0, v1, v2, v3, v4}, Le/f/a/d/a/b/l1;->b(Ljava/lang/String;IJ)V

    const/4 v0, 0x0

    return-object v0
.end method
