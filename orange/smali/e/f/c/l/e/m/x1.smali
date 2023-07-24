.class public final synthetic Le/f/c/l/e/m/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# instance fields
.field public final a:Le/f/c/l/e/m/z1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/l/e/m/x1;->a:Le/f/c/l/e/m/z1;

    return-void
.end method

.method public static a(Le/f/c/l/e/m/z1;)Le/f/a/b/h/a;
    .locals 1

    new-instance v0, Le/f/c/l/e/m/x1;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/x1;-><init>(Le/f/c/l/e/m/z1;)V

    return-object v0
.end method


# virtual methods
.method public a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/l/e/m/x1;->a:Le/f/c/l/e/m/z1;

    invoke-static {v0, p1}, Le/f/c/l/e/m/z1;->a(Le/f/c/l/e/m/z1;Le/f/a/b/h/g;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
