.class public final synthetic Le/f/a/a/j/j0/j/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/a/j/j0/j/s;

.field public final c:Le/f/a/a/j/x;

.field public final d:I

.field public final e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/n;->b:Le/f/a/a/j/j0/j/s;

    iput-object p2, p0, Le/f/a/a/j/j0/j/n;->c:Le/f/a/a/j/x;

    iput p3, p0, Le/f/a/a/j/j0/j/n;->d:I

    iput-object p4, p0, Le/f/a/a/j/j0/j/n;->e:Ljava/lang/Runnable;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;ILjava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/n;

    invoke-direct {v0, p0, p1, p2, p3}, Le/f/a/a/j/j0/j/n;-><init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;ILjava/lang/Runnable;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Le/f/a/a/j/j0/j/n;->b:Le/f/a/a/j/j0/j/s;

    iget-object v1, p0, Le/f/a/a/j/j0/j/n;->c:Le/f/a/a/j/x;

    iget v2, p0, Le/f/a/a/j/j0/j/n;->d:I

    iget-object v3, p0, Le/f/a/a/j/j0/j/n;->e:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;ILjava/lang/Runnable;)V

    return-void
.end method
