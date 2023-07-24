.class public Le/f/c/l/e/v/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/l/e/m/h1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/h1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/v/g;->a:Le/f/c/l/e/m/h1;

    return-void
.end method

.method public static a(I)Le/f/c/l/e/v/h;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 4
    new-instance p0, Le/f/c/l/e/v/b;

    invoke-direct {p0}, Le/f/c/l/e/v/b;-><init>()V

    return-object p0

    .line 5
    :cond_0
    new-instance p0, Le/f/c/l/e/v/i;

    invoke-direct {p0}, Le/f/c/l/e/v/i;-><init>()V

    return-object p0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "settings_version"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 2
    invoke-static {v0}, Le/f/c/l/e/v/g;->a(I)Le/f/c/l/e/v/h;

    move-result-object v0

    .line 3
    iget-object v1, p0, Le/f/c/l/e/v/g;->a:Le/f/c/l/e/m/h1;

    invoke-interface {v0, v1, p1}, Le/f/c/l/e/v/h;->a(Le/f/c/l/e/m/h1;Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;

    move-result-object p1

    return-object p1
.end method
