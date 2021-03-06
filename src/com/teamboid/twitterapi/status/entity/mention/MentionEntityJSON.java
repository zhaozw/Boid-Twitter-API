package com.teamboid.twitterapi.status.entity.mention;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Handles parsing JSON and assigning values to a {@link MentionEntity} interface.
 * @author Aidan Follestad
 */
public class MentionEntityJSON implements MentionEntity, Serializable {

	private static final long serialVersionUID = -3496982885877242228L;

	public MentionEntityJSON(JSONObject json) throws JSONException {
        _id = json.optLong("id");
        _screenName = json.optString("screen_name");
        _name = json.optString("name");
        JSONArray indices = json.getJSONArray("indices");
        _startIndex = indices.getInt(0);
        _endIndex = indices.getInt(1);
    }

    private long _id;
    private String _screenName;
    private String _name;
    private int _startIndex;
    private int _endIndex;

    /**
     * {@inheritDoc}
     */
    @Override
    public long getId() { return _id; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getScreenName() { return _screenName; }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() { return _name; }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getStartIndex() { return _startIndex; }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getEndIndex() { return _endIndex; }
}
