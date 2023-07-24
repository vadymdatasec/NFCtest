.class public final synthetic Le/f/a/d/a/b/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/b0;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/c2;->b:Le/f/a/d/a/b/b0;

    return-void
.end method

.method public static a(Le/f/a/d/a/b/b0;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/a/d/a/b/c2;

    invoke-direct {v0, p0}, Le/f/a/d/a/b/c2;-><init>(Le/f/a/d/a/b/b0;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/c2;->b:Le/f/a/d/a/b/b0;

    invoke-virtual {v0}, Le/f/a/d/a/b/b0;->f()V

    return-void
.end method
