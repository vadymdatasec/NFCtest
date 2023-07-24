.class public final synthetic Le/f/a/d/a/b/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/t1;

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/t1;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/q1;->b:Le/f/a/d/a/b/t1;

    iput p2, p0, Le/f/a/d/a/b/q1;->c:I

    iput-object p3, p0, Le/f/a/d/a/b/q1;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/q1;->b:Le/f/a/d/a/b/t1;

    iget v1, p0, Le/f/a/d/a/b/q1;->c:I

    iget-object v2, p0, Le/f/a/d/a/b/q1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Le/f/a/d/a/b/t1;->b(ILjava/lang/String;)V

    return-void
.end method
