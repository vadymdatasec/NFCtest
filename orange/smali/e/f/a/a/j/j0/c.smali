.class public Le/f/a/a/j/j0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/e;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Le/f/a/a/j/j0/j/y;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Le/f/a/a/j/g0/g;

.field public final d:Le/f/a/a/j/j0/k/e;

.field public final e:Le/f/a/a/j/k0/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/f/a/a/j/c0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le/f/a/a/j/j0/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Le/f/a/a/j/g0/g;Le/f/a/a/j/j0/j/y;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/k0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/c;->b:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/c;->c:Le/f/a/a/j/g0/g;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/j0/c;->a:Le/f/a/a/j/j0/j/y;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/j0/c;->d:Le/f/a/a/j/j0/k/e;

    .line 6
    iput-object p5, p0, Le/f/a/a/j/j0/c;->e:Le/f/a/a/j/k0/b;

    return-void
.end method

.method public static synthetic a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)Ljava/lang/Object;
    .locals 1

    .line 13
    iget-object v0, p0, Le/f/a/a/j/j0/c;->d:Le/f/a/a/j/j0/k/e;

    invoke-interface {v0, p1, p2}, Le/f/a/a/j/j0/k/e;->a(Le/f/a/a/j/x;Le/f/a/a/j/q;)Le/f/a/a/j/j0/k/l;

    .line 14
    iget-object p0, p0, Le/f/a/a/j/j0/c;->a:Le/f/a/a/j/j0/j/y;

    const/4 p2, 0x1

    invoke-interface {p0, p1, p2}, Le/f/a/a/j/j0/j/y;->a(Le/f/a/a/j/x;I)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)V
    .locals 2

    .line 2
    :try_start_0
    iget-object v0, p0, Le/f/a/a/j/j0/c;->c:Le/f/a/a/j/g0/g;

    .line 3
    invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Le/f/a/a/j/g0/g;->a(Ljava/lang/String;)Le/f/a/a/j/g0/r;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p0, "Transport backend \'%s\' is not registered"

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v0

    .line 5
    invoke-static {p0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 6
    sget-object p1, Le/f/a/a/j/j0/c;->f:Ljava/util/logging/Logger;

    invoke-virtual {p1, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Le/f/a/a/h;->a(Ljava/lang/Exception;)V

    return-void

    .line 8
    :cond_0
    invoke-interface {v0, p3}, Le/f/a/a/j/g0/r;->a(Le/f/a/a/j/q;)Le/f/a/a/j/q;

    move-result-object p3

    .line 9
    iget-object v0, p0, Le/f/a/a/j/j0/c;->e:Le/f/a/a/j/k0/b;

    invoke-static {p0, p1, p3}, Le/f/a/a/j/j0/b;->a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)Le/f/a/a/j/k0/a;

    move-result-object p0

    invoke-interface {v0, p0}, Le/f/a/a/j/k0/b;->a(Le/f/a/a/j/k0/a;)Ljava/lang/Object;

    const/4 p0, 0x0

    .line 10
    invoke-interface {p2, p0}, Le/f/a/a/h;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 11
    sget-object p1, Le/f/a/a/j/j0/c;->f:Ljava/util/logging/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error scheduling event "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 12
    invoke-interface {p2, p0}, Le/f/a/a/h;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/j/x;Le/f/a/a/j/q;Le/f/a/a/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/a/j/j0/c;->b:Ljava/util/concurrent/Executor;

    invoke-static {p0, p1, p3, p2}, Le/f/a/a/j/j0/a;->a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
