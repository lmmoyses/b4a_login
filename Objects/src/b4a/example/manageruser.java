package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class manageruser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.manageruser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.manageruser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _bdd = "";
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.mainmenu _mainmenu = null;
public b4a.example.mainusuario _mainusuario = null;
public String  _initialize(b4a.example.manageruser __ref,anywheresoftware.b4a.BA _ba,String _bddnombre) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_bddnombre}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (BDDNombre As String)";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="bdd = BDDNombre";
__ref._bdd /*String*/  = _bddnombre;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="sql.Initialize(File.DirInternal, bdd, True)";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),__ref._bdd /*String*/ ,__c.True);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS usua";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS usuario(id_user INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT(60), email TEXT(30), password TEXT(30))");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.manageruser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Public bdd As String";
_bdd = "";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public b4a.example.usuario  _create_user(b4a.example.manageruser __ref,String _nombre,String _email,String _passw) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "create_user", false))
	 {return ((b4a.example.usuario) Debug.delegate(ba, "create_user", new Object[] {_nombre,_email,_passw}));}
b4a.example.usuario _usr = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub create_User(nombre As String, email As";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim usr As Usuario";
_usr = new b4a.example.usuario();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="usr.Nombre = nombre";
_usr._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="usr.Email = email";
_usr._email /*String*/  = _email;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="usr.Password = passw";
_usr._password /*String*/  = _passw;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO usuario(nombre, em";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO usuario(nombre, email, password) VALUES (?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombre),(Object)(_email),(Object)(_passw)}));
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Return usr";
if (true) return _usr;
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="End Sub";
return null;
}
public String  _delete_user(b4a.example.manageruser __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "delete_user", false))
	 {return ((String) Debug.delegate(ba, "delete_user", new Object[] {_id}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub delete_User( id As Int)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM usuario WHERE id_u";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE FROM usuario WHERE id_user = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _readbyemail(b4a.example.manageruser __ref,String _email) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "readbyemail", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readbyemail", new Object[] {_email}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
anywheresoftware.b4a.objects.collections.List _user_item = null;
int _i = 0;
b4a.example.usuario _aux_urs = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub readByEmail(email As String) As List";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim user_item As List";
_user_item = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="user_item.Initialize()";
_user_item.Initialize();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM usuario WHER";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM usuario WHERE email LIKE ?",new String[]{"%"+_email+"%"})));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="For i = 0 To curs.RowCount -1 Step 1";
{
final int step5 = 1;
final int limit5 = (int) (_curs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="curs.Position = i";
_curs.setPosition(_i);
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Dim aux_urs As Usuario";
_aux_urs = new b4a.example.usuario();
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="aux_urs.Id_usuario = curs.GetInt(\"id_user\")";
_aux_urs._id_usuario /*int*/  = _curs.GetInt("id_user");
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="aux_urs.Nombre = curs.GetString(\"nombre\")";
_aux_urs._nombre /*String*/  = _curs.GetString("nombre");
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="aux_urs.Email = curs.GetString(\"email\")";
_aux_urs._email /*String*/  = _curs.GetString("email");
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="aux_urs.Password = curs.GetString(\"password\")";
_aux_urs._password /*String*/  = _curs.GetString("password");
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="user_item.Add(aux_urs)";
_user_item.Add((Object)(_aux_urs));
 }
};
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="Return user_item";
if (true) return _user_item;
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="End Sub";
return null;
}
public b4a.example.usuario  _readone_email(b4a.example.manageruser __ref,String _email) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "readone_email", false))
	 {return ((b4a.example.usuario) Debug.delegate(ba, "readone_email", new Object[] {_email}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
b4a.example.usuario _item = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub readOne_email(email As String) As Usuar";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM usuario WHER";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM usuario WHERE email = ?",new String[]{_email})));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="If curs.RowCount < 1 Then";
if (_curs.getRowCount()<1) { 
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Return Null";
if (true) return (b4a.example.usuario)(__c.Null);
 }else {
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="curs.Position = 0";
_curs.setPosition((int) (0));
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Dim item As Usuario";
_item = new b4a.example.usuario();
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="item.Id_usuario = curs.GetInt(\"id_user\")";
_item._id_usuario /*int*/  = _curs.GetInt("id_user");
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="item.Nombre = curs.GetString(\"nombre\")";
_item._nombre /*String*/  = _curs.GetString("nombre");
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="item.Email = curs.GetString(\"email\")";
_item._email /*String*/  = _curs.GetString("email");
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="item.Password = curs.GetString(\"password\")";
_item._password /*String*/  = _curs.GetString("password");
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="Return item";
if (true) return _item;
 };
RDebugUtils.currentLine=3801105;
 //BA.debugLineNum = 3801105;BA.debugLine="End Sub";
return null;
}
public b4a.example.usuario  _update_user(b4a.example.manageruser __ref,int _id,String _nombre,String _email,String _passw) throws Exception{
__ref = this;
RDebugUtils.currentModule="manageruser";
if (Debug.shouldDelegate(ba, "update_user", false))
	 {return ((b4a.example.usuario) Debug.delegate(ba, "update_user", new Object[] {_id,_nombre,_email,_passw}));}
b4a.example.usuario _usr = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub update_User(id As Int, nombre As String";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim usr As Usuario";
_usr = new b4a.example.usuario();
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="usr.Nombre = nombre";
_usr._nombre /*String*/  = _nombre;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="usr.Email = email";
_usr._email /*String*/  = _email;
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="usr.Password = passw";
_usr._password /*String*/  = _passw;
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="sql.ExecNonQuery2( _ 	\"UPDATE usuario SET nombre";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE usuario SET nombre = ?, email = ?, password = ? WHERE id_user = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombre),(Object)(_email),(Object)(_passw),(Object)(_id)}));
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="Return usr";
if (true) return _usr;
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="End Sub";
return null;
}
}