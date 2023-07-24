.class public final synthetic Le/f/a/a/j/j0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/a/j/j0/c;

.field public final c:Le/f/a/a/j/x;

.field public final d:Le/f/a/a/h;

.field public final e:Le/f/a/a/j/q;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/a;->b:Le/f/a/a/j/j0/c;

    iput-object p2, p0, Le/f/a/a/j/j0/a;->c:Le/f/a/a/j/x;

    iput-object p3, p0, Le/f/a/a/j/j0/a;->d:Le/f/a/a/h;

    iput-object p4, p0, Le/f/a/a/j/j0/a;->e:Le/f/a/a/j/q;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/a;

    invoke-direct {v0, p0, p1, p2, p3}, Le/f/a/a/j/j0/a;-><init>(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Le/f/a/a/j/j0/a;->b:Le/f/a/a/j/j0/c;

    iget-object v1, p0, Le/f/a/a/j/j0/a;->c:Le/f/a/a/j/x;

    iget-object v2, p0, Le/f/a/a/j/j0/a;->d:Le/f/a/a/h;

    iget-object v3, p0, Le/f/a/a/j/j0/a;->e:Le/f/a/a/j/q;

    invoke-static {v0, v1, v2, v3}, Le/f/a/a/j/j0/c;->a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/h;Le/f/a/a/j/q;)V

    return-void
.end method
