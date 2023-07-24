.class public final synthetic Le/f/c/l/e/u/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/h;


# instance fields
.field public final a:Le/f/a/b/h/h;

.field public final b:Le/f/c/l/e/m/e1;


# direct methods
.method public constructor <init>(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/l/e/u/a;->a:Le/f/a/b/h/h;

    iput-object p2, p0, Le/f/c/l/e/u/a;->b:Le/f/c/l/e/m/e1;

    return-void
.end method

.method public static a(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;)Le/f/a/a/h;
    .locals 1

    new-instance v0, Le/f/c/l/e/u/a;

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/u/a;-><init>(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Le/f/c/l/e/u/a;->a:Le/f/a/b/h/h;

    iget-object v1, p0, Le/f/c/l/e/u/a;->b:Le/f/c/l/e/m/e1;

    invoke-static {v0, v1, p1}, Le/f/c/l/e/u/c;->a(Le/f/a/b/h/h;Le/f/c/l/e/m/e1;Ljava/lang/Exception;)V

    return-void
.end method
