.class public final synthetic Le/f/a/b/b/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/c;


# instance fields
.field public final a:Le/f/a/b/b/e;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Le/f/a/b/b/e;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/c0;->a:Le/f/a/b/b/e;

    iput-object p2, p0, Le/f/a/b/b/c0;->b:Ljava/lang/String;

    iput-object p3, p0, Le/f/a/b/b/c0;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)V
    .locals 3

    iget-object v0, p0, Le/f/a/b/b/c0;->a:Le/f/a/b/b/e;

    iget-object v1, p0, Le/f/a/b/b/c0;->b:Ljava/lang/String;

    iget-object v2, p0, Le/f/a/b/b/c0;->c:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {v0, v1, v2, p1}, Le/f/a/b/b/e;->a(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Le/f/a/b/h/g;)V

    return-void
.end method
